package com.hexiCloud.portalDB.daoImpl;

import java.util.List;

import javax.sql.DataSource;

import org.apache.log4j.Logger;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexiCloud.portalDB.bean.UserEmail;
import com.hexiCloud.portalDB.dao.UserEmailsDAO;
import com.hexiCloud.portalDB.util.SqlQueryConstantsUtil;

@Repository
public class UserEmailsDAOImpl implements UserEmailsDAO {
	private static final Logger logger = Logger.getLogger(UserEmailsDAOImpl.class);
	private JdbcTemplate jdbcTemplate;
	private DataSource dataSource;

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jdbcTemplate = new JdbcTemplate(this.dataSource);
	}

	@Override
	public List<UserEmail> getUserEmails(String userId) {
		logger.info(" Begining of getUserEmails() ");

		@SuppressWarnings({ "unchecked", "rawtypes" })
		List<UserEmail> userEmailsList = jdbcTemplate.query(SqlQueryConstantsUtil.SQL_FIND_USER_EMAILS_BY_ID,
				new Object[] { userId }, new BeanPropertyRowMapper(UserEmail.class));

		logger.info("getUserEmails size ===========> " + userEmailsList != null ? userEmailsList.size() : null);
		logger.info(" End of getUserEmails() ");
		return userEmailsList;
	}

	@Override
	public void saveUserEmail(UserEmail userEmail) {
		logger.info(" Begining of saveUserEmail() ");

		// SQL_SAVE_USER_EMAIL = "INSERT INTO USER_EMAILS (USER_ID, SUBJECT,
		// MESSAGE, CREATED_DATE, SENT_TO,SENT_CC,SENT_BCC) VALUES
		// (?,?,?,SYSDATE,?,?,?)";

		jdbcTemplate.update(SqlQueryConstantsUtil.SQL_SAVE_USER_EMAIL,
				new Object[] { userEmail.getUserId(), userEmail.getSubject(), userEmail.getMessage(),
						userEmail.getSentTo(), userEmail.getSentCC(), userEmail.getSentBCC() });

		logger.info(" End of saveUserEmail() ");

	}

}
