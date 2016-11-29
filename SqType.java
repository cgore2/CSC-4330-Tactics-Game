package data;

public enum SqType {
	
	Water("water"), O("outer"), D("dolphin"), RD("redDolphin"), MenuSDMC("MenuSDMC"),
	Tree("tree"), SNW("SandNW"), SNE("SandNE"), SSW("SandSW"), SSE("SandSE"),
	SN("SandN"), SS("SandS"), SW("SandW"), SE("SandE"), ON("outern"), OW("outerw");
	
	
	String textName;


	
	SqType(String textName){
		this.textName = textName;
		
	}

}
