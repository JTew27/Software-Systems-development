package wk4Exceptions;



public class ArrayProcessor {
String a [];
int count = 0;

public int getArrayLength(String a [] ) {
try{for(int i =0; i < a.length; i++){
	//Object t = a[count];
	count++;
	
	
}
return count;
}

catch(Exception e){
	return 0;	
}

}
}