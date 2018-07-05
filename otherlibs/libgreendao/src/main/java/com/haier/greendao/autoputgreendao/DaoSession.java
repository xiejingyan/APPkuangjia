package com.haier.greendao.autoputgreendao;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.haier.greendao.demogreendao.bean.SecondBean;

import com.haier.greendao.autoputgreendao.SecondBeanDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig secondBeanDaoConfig;

    private final SecondBeanDao secondBeanDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        secondBeanDaoConfig = daoConfigMap.get(SecondBeanDao.class).clone();
        secondBeanDaoConfig.initIdentityScope(type);

        secondBeanDao = new SecondBeanDao(secondBeanDaoConfig, this);

        registerDao(SecondBean.class, secondBeanDao);
    }
    
    public void clear() {
        secondBeanDaoConfig.clearIdentityScope();
    }

    public SecondBeanDao getSecondBeanDao() {
        return secondBeanDao;
    }

}