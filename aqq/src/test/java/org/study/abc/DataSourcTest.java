package org.study.abc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import javax.sql.DataSource;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.ResultActions;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)//SpringJUnit4ClassRunner ����������
@WebAppConfiguration //web�߰� ������ ����
@ContextConfiguration(locations= //���� ������ġ �ο���
{"file:src/main/webapp/WEB-INF/spring/**/*.xml"})
public class DataSourcTest {//DataSourcTest ��Ŭ�󽺷� jult���� ���Ͽ��ڵ����� ��
	
	
	@Autowired
	DataSource ds;//root ���� ����� ������ ?

	@Autowired
	WebApplicationContext webCtx;
	
	MockMvc mockMvc;//���������� ��û�� �޾ƿ� ��ü
	
	@Before
	public void setup() {
		this.mockMvc= MockMvcBuilders.webAppContextSetup(this.webCtx).build();
	}
	
	@Test
	public void testDataSource() throws Exception{
		Assert.assertNotNull(ds.getConnection());//ds.getConnection�޼ҵ�� null���� �Ǹ�ȵȴٶ�� �ǹ�
		//������� �׽�Ʈ 1 ��Ʈ 
	}	
	@Test
	public void testControllerHome() throws Exception{
	ResultActions ok = mockMvc.perform(MockMvcRequestBuilders.get("/"));//mockMvc�� ������� ��û�� ��ƿͼ� ��� �ϱ�����
	
	ok.andExpect(status().isOk());
	//2��Ʈ ��Ʈ�ѷ� �׽�Ʈ �Ϸ��� 
	//ok.content("serverTime");
	}
}
