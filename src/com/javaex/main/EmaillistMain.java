package com.javaex.main;

import java.util.List;

import com.javaex.dao.EmaillistDAO;
import com.javaex.vo.EmailVO;

public class EmaillistMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmaillistDAO edao = new EmaillistDAO();
		EmailVO evo = new EmailVO();
//		evo.setFirstName("승현");
//		evo.setLastName("조");
//		evo.setEmail("끼요옷@naver.com");
//		edao.insert(evo);
		
		List<EmailVO> l = edao.getList();
		for(EmailVO e : l) {
			System.out.println(e);
		}
	}

}
