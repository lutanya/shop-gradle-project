package by.epam.mentoring.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibatis.sqlmap.client.SqlMapClient;

import by.epam.mentoring.entity.Entity;


@Repository
public abstract class EntityDaoImp<T extends Entity, K> implements EntityDao<T, K> {
	@Autowired
	protected SqlMapClient sqlMap;

}
