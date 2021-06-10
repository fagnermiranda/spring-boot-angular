package br.com.spring.core.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public abstract class AbstractService<T, I> implements IOperations<T, I> {

	@Autowired
	protected JpaRepository<T, I> repository;

	@Override
	@Transactional(readOnly = true)
	public T findById(final I id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	@Transactional(readOnly = true)
	public List<T> findAll() {
		return repository.findAll();
	}

	@Override
	public Page<T> findPaginated(final int page, final int size) {
		return repository.findAll(PageRequest.of(page, size));
	}

	@Override
	public T create(final T entity) {
		return repository.save(entity);
	}

	@Override
	public T update(final T entity) {
		return repository.save(entity);
	}

	@Override
	public void delete(final T entity) {
		repository.delete(entity);
	}

	@Override
	public void deleteById(final I entityId) {
		repository.deleteById(entityId);
	}

}
