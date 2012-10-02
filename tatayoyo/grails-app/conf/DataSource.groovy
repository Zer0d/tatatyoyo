dataSource {
    pooled = true
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
	dataSource {
		pooled=true
		dbCreate='update'
		url='jdbc:mysql://localhost:3306/zeroddbname?useUnicode=yes&characterEncoding=UTF-8'
		driverClassName='com.mysql.jdbc.Driver'
		dialect='org.hibernate.dialect.MySQL5InnoDBDialect'
		username='zerodusername'
		password='zerodpassword'
		properties {
			maxActive=5
			maxIdle=3
			minIdle=1
			initialSize=1
			removeAbandoned=true
			minEvictableIdleTimeMillis=60000
			timeBetweenEvictionRunsMillis=60000
			maxWait=10000
			validationQuery='SELECT 1'
			testOnBorrow=true
			testOnReturn=true
			testWhileIdle=true
		}
	}
}
test {
	dataSource {
		pooled=true
		dbCreate='update'
		url='jdbc:mysql://localhost:3306/zeroddbname?useUnicode=yes&characterEncoding=UTF-8'
		driverClassName='com.mysql.jdbc.Driver'
		dialect='org.hibernate.dialect.MySQL5InnoDBDialect'
		username='zerodusername'
		password='zerodpassword'
		properties {
			maxActive=5
			maxIdle=3
			minIdle=1
			initialSize=1
			removeAbandoned=true
			minEvictableIdleTimeMillis=60000
			timeBetweenEvictionRunsMillis=60000
			maxWait=10000
			validationQuery='SELECT 1'
			testOnBorrow=true
			testOnReturn=true
			testWhileIdle=true
		}
	}
}
production {
	dataSource {
		pooled=true
		dbCreate='update'
		url='jdbc:mysql://localhost3306/zeroddbname?useUnicode=yes&characterEncoding=UTF-8'
		driverClassName='com.mysql.jdbc.Driver'
		dialect='org.hibernate.dialect.MySQL5InnoDBDialect'
		username='zerodusername'
		password='zerodpassword'
		properties {
			maxActive=50
			maxIdle=25
			minIdle=5
			initialSize=5
			removeAbandoned=true
			minEvictableIdleTimeMillis=60000
			timeBetweenEvictionRunsMillis=60000
			maxWait=10000
			validationQuery='SELECT 1'
			testOnBorrow=true
			testOnReturn=true
			testWhileIdle=true
		}
	}
}

}
