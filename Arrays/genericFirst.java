package genericBasics;

class GenTypeFinder<GenVarType1,GenVarType2>{
	GenVarType1 tempVar;
	
	GenTypeFinder(GenVarType1 ParamVar1, GenVarType2 ParamVar2){
		tempVar = ParamVar1;
		System.out.println("The name of the subject is "+ tempVar + 
				" and subject's age is "+ ParamVar2);
		System.out.println("The type of the name is "+ tempVar.getClass().getSimpleName() +
				" and the type of the age is " + ParamVar2.getClass().getSimpleName());
	}
}

class genericFirst{
	public static void main(String args[]){
		GenTypeFinder GenObj1 = new GenTypeFinder("Vijay",39);
		GenTypeFinder <Integer, Integer>GenObj2 = new GenTypeFinder<Integer, Integer>(14,39);
		GenTypeFinder GenObj3 = new GenTypeFinder('V','S');
		int a =14;
		GenTypeFinder GenObj4 = new GenTypeFinder('V',a);
		Integer b = a;
		System.out.println("The type of the name is "+ a +
				" and the type of the age is " + b.getClass().getSimpleName());
		
	}
}