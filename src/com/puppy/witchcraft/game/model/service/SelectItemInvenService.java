package com.puppy.witchcraft.game.model.service;

import static com.puppy.witchcraft.common.Template.getSqlSession;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.puppy.witchcraft.game.model.dto.ImageDTO;
import com.puppy.witchcraft.game.model.dto.MyItemInven;
import com.puppy.witchcraft.game.model.mapper.craft.SqlMapper;

public class SelectItemInvenService {
	
	private static SqlMapper mapper;

	public List<MyItemInven> myItemInven(int playerNo) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SqlMapper.class);
		
		List<MyItemInven> itemList = new ArrayList<>();
		
		itemList = mapper.myItemInven(playerNo);
		
		sqlSession.close();
		
		return itemList;
	}

	public ImageDTO imageSource(int imageNo) {
		
		SqlSession sqlSession = getSqlSession();
		mapper = sqlSession.getMapper(SqlMapper.class);
		
		ImageDTO image = mapper.selectItemImage(imageNo);
		
		sqlSession.close();
		
		return image;
	}

}
