package com.ravi.department_service.repository;

import com.ravi.department_service.entity.Department;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.FluentQuery;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class DepartmentRepo implements JpaRepository<Department, Long> {
    @Override
    public void flush() {

    }

    @Override
    public <S extends Department> S saveAndFlush(S entity) {
        return null;
    }

    @Override
    public <S extends Department> List<S> saveAllAndFlush(Iterable<S> entities) {
        return null;
    }

    @Override
    public void deleteAllInBatch(Iterable<Department> entities) {

    }

    @Override
    public void deleteAllByIdInBatch(Iterable<Long> longs) {

    }

    @Override
    public void deleteAllInBatch() {

    }

    @Override
    public Department getOne(Long aLong) {
        return null;
    }

    @Override
    public Department getById(Long aLong) {
        return null;
    }

    @Override
    public Department getReferenceById(Long aLong) {
        return null;
    }

    @Override
    public <S extends Department> Optional<S> findOne(Example<S> example) {
        return Optional.empty();
    }

    @Override
    public <S extends Department> List<S> findAll(Example<S> example) {
        return null;
    }

    @Override
    public <S extends Department> List<S> findAll(Example<S> example, Sort sort) {
        return null;
    }

    @Override
    public <S extends Department> Page<S> findAll(Example<S> example, Pageable pageable) {
        return null;
    }

    @Override
    public <S extends Department> long count(Example<S> example) {
        return 0;
    }

    @Override
    public <S extends Department> boolean exists(Example<S> example) {
        return false;
    }

    @Override
    public <S extends Department, R> R findBy(Example<S> example, Function<FluentQuery.FetchableFluentQuery<S>, R> queryFunction) {
        return null;
    }

    @Override
    public <S extends Department> S save(S entity) {
        return null;
    }

    @Override
    public <S extends Department> List<S> saveAll(Iterable<S> entities) {
        return null;
    }

    @Override
    public Optional<Department> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public List<Department> findAll() {
        return null;
    }

    @Override
    public List<Department> findAllById(Iterable<Long> longs) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Department entity) {

    }

    @Override
    public void deleteAllById(Iterable<? extends Long> longs) {

    }

    @Override
    public void deleteAll(Iterable<? extends Department> entities) {

    }

    @Override
    public void deleteAll() {

    }

    @Override
    public List<Department> findAll(Sort sort) {
        return null;
    }

    @Override
    public Page<Department> findAll(Pageable pageable) {
        return null;
    }
}
