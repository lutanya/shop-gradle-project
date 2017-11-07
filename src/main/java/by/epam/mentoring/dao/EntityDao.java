package by.epam.mentoring.dao;

import by.epam.mentoring.entity.Entity;

public interface EntityDao<T extends Entity, K> {

	boolean create(T entity);

	boolean update(T entity);

	boolean deleteById(K id);

	T findById(K id);

}
