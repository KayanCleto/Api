package com.uniso.api.demo.Repository;

import com.uniso.api.demo.Model.Matilha;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public
interface MatilhaRepository extends JpaRepository<Matilha,Long> {
}
