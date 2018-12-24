package com.example.demo.rm;
import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

import com.example.demo.entites.Equipe;
import com.example.demo.entites.Joueur;

public class UserRowMapper implements RowMapper<Joueur>{
    @Override
    public Joueur mapRow(ResultSet rs, int i) throws SQLException {
        Joueur u=new Joueur();
        u.setNom(rs.getString("name"));
        u.setAge(rs.getInt("age"));
        u.setEmail(rs.getString("email"));
        u.setSexe(rs.getString("sexe"));
        
        u.setTelephone(rs.getString("telephone"));
 
        u.setMotDePasse(rs.getString("motDePasse"));
        return u;
    }    
}