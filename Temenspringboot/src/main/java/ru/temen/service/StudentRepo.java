package ru.temen.service;

import org.springframework.data.repository.CrudRepository;
import ru.temen.domain.Student;

/**
 * Created by temen on 09.02.17.
 */
public interface StudentRepo extends CrudRepository<Student, Long> {
}
