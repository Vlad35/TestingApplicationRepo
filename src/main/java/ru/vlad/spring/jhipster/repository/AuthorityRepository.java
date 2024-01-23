package ru.vlad.spring.jhipster.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vlad.spring.jhipster.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
