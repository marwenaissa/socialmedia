package com.platform.socialmedia.repositories;

import com.platform.socialmedia.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Aucune méthode spécifique ici car elles sont définies dans IRepository
}
