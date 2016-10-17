package sy.dao.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan(basePackages="sy.dao.mapper")
public class DaoConfig {
	
		public @Bean(initMethod="init",destroyMethod="close") DataSource dataSource(){
			DruidDataSource ds = new DruidDataSource();
			//有配置中心，可以从配置中心取
			ds.setUrl("jdbc:mysql://192.168.233.131:3306/test_spring_boot?useUnicode=true&characterEncoding=UTF-8");
			ds.setUsername("root");
			ds.setPassword("root@123456");
			ds.setInitialSize(0);
			ds.setMaxActive(50);
			ds.setMaxWait(6000);
			//.....
			return ds;
		}
		
		public @Bean SqlSessionFactory sqlSessionFactory() throws Exception{
			SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
			sqlSessionFactory.setDataSource(dataSource());
			sqlSessionFactory.setConfigLocation(new ClassPathResource("config/mapper-config.xml"));
			return sqlSessionFactory.getObject();
		}
		
		public @Bean SqlSessionTemplate sqlSessionTemplate() throws Exception{
			return new SqlSessionTemplate(sqlSessionFactory());
		}
		
}
