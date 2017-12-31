package com.spring.myapp.controller;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import com.spring.myapp.service.BoardService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"file:src/main/webapp/WEB-INF/spring/appServlet/servlet-context.xml",
     "file:src/main/webapp/WEB-INF/spring/root-context.xml"})
@WebAppConfiguration
public class BoardControllerTest{
	
	@Mock
    BoardService boardService;

    @InjectMocks
    BoardController boardController;
    
    private MockMvc mockMvc;


    @Before
    public void setUp() throws Exception {
    }

	@Test
	public void testCategoryController() throws Exception {
		
         when(boardService.test()).thenReturn(10);
         this.mockMvc.perform(get("/board/list")).andExpect(status().isOk());

		//Mockito.verify(boardService).test();
		//Mockito.verifyNoMoreInteractions(boardService);
	}
}
