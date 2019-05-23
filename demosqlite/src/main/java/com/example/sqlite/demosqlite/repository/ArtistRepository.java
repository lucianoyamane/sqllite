package com.example.sqlite.demosqlite.repository;

import com.example.sqlite.demosqlite.entity.ArtistEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.sql.*;
import java.util.List;

@Repository
public class ArtistRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(readOnly=true)
    public List<ArtistEntity> load() {
        return jdbcTemplate.query("SELECT ArtistId, Name FROM artists",
                new ArtistRowMapper());
    }

    @Transactional(readOnly=true)
    public ArtistEntity get(Integer id) {
        return jdbcTemplate.queryForObject(
                "SELECT ArtistId, Name FROM artists WHERE ArtistId=?",
                new Object[]{id}, new ArtistRowMapper());
    }

    public Boolean save(final ArtistEntity artistEntity) {

        final String sql = "INSERT INTO artists(name) values(?)";

        Integer rows = jdbcTemplate.update(sql, new Object[]{artistEntity.name});
        return rows > 0;
    }

    public Boolean update(final ArtistEntity artistEntity, Integer id) {

        final String sql = "UPDATE artists SET name=? WHERE ArtistId=?";

        Integer rows = jdbcTemplate.update(sql, new Object[]{artistEntity.name, id});
        return rows > 0;
    }

    public Boolean delete(Integer id) {

        final String sql = "DELETE FROM artists WHERE ArtistId=?";

        Integer rows = jdbcTemplate.update(sql, new Object[]{id});
        return rows > 0;
    }

    class ArtistRowMapper implements RowMapper<ArtistEntity> {
        @Override
        public ArtistEntity mapRow(ResultSet rs, int rowNum) throws SQLException {
            ArtistEntity artistEntity = new ArtistEntity();
            artistEntity.id = rs.getInt("ArtistId");
            artistEntity.name = rs.getString("Name");
            return artistEntity;
        }
    }

}
