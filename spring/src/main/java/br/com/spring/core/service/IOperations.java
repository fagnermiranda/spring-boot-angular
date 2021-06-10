package br.com.spring.core.service;

import java.util.List;

import org.springframework.data.domain.Page;

public interface IOperations<T, I> {

	T findById(final I id);

	List<T> findAll();

	Page<T> findPaginated(int page, int size);

	T create(final T entity);

	T update(final T entity);

	void delete(final T entity);

	void deleteById(I id);

}
