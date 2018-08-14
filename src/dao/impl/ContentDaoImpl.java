package dao.impl;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateCallback;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;

import dao.ContentDao;
import domain.Content;

public class ContentDaoImpl extends HibernateDaoSupport implements ContentDao{

	@Override
	public List<Content> getByCategory(final int categoryIndex,final int currentIndex) {
		List<Content> list=(List<Content>)getHibernateTemplate().execute(
	            new HibernateCallback<List<Content>>(){
	                @Override
	                public List<Content> doInHibernate(Session session)
	                        throws HibernateException{
	                    String hql= "from Content where category_id=?0";
	                    Query<Content> query = session.createQuery(hql);
	                    query.setParameter(0, categoryIndex);
	                    int begin = (currentIndex-1)*9;
	                    query.setFirstResult(begin);
	                    query.setMaxResults(9);
	                    return query.list();
	                }}    
	        );
		return list;
	}

	@Override
	public int getCountByCategory(final int categoryIndex) {
		Integer count=getHibernateTemplate().execute(
	            new HibernateCallback<Integer>(){
	                @Override
	                public Integer doInHibernate(Session session)
	                        throws HibernateException{
	                    String hql= "select count(*) from Content where category_id=?0";
	                    Query query = session.createQuery(hql);
	                    query.setParameter(0, categoryIndex);
	                    Long l=(Long)query.uniqueResult();
	                    return l.intValue();
	                }}    
	        );
		return count;
	}

	@Override
	public List<Content> getBuyId(int contentid) {
		List<Content> list = (List<Content>) this.getHibernateTemplate().find("from Content where id=?0", contentid);
		return list;
		
	}

}
