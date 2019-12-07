package com.lambdaexpressions.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import com.lambdaexpressions.example.dto.FirstDTO;
import com.lambdaexpressions.example.dto.SecondDTO;

/***
 * 
 * @author ravi.thapa
 *	This class will copy the objects of one collection to another where
 *  both class has different attribute name.
 */


class CopyCollectionObjects {

	public static void main(String[] args) {
		List<SecondDTO> secondList  = getFirstList().stream().map( f -> new SecondDTO(f.getId(), f.getName(), f.getStatus())).collect(Collectors.toList());
		
		secondList.forEach( s -> {
			System.out.println("Roll NO : "+s.getRollNo() + "     Name : "  + s.getStudentName());
		});
	}
	
	public static List<FirstDTO> getFirstList(){
		List<FirstDTO> firstList = new ArrayList<FirstDTO>();
		firstList.add(new FirstDTO(1, "Ravi", true));
		firstList.add(new FirstDTO(2, "Prakash", true));
		firstList.add(new FirstDTO(3, "Nidhi", false));
		firstList.add(new FirstDTO(4, "Ani", true));
		firstList.add(new FirstDTO(5, "Julie", false));
		firstList.add(new FirstDTO(6, "Robby", true));
		return firstList;
	}//end of the method

}//end of the class
