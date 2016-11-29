package data;

public enum SqType {
	
        /**
        * Each Each of the predefined constants is set to allow simple calls to 
        * the images in the "res" file EX: Water is later use in the path
        * res/water.png with .png being the final part of the name.
        * 
        */
	Water("water"), O("outer"), D("dolphin"), RD("redDolphin"), MenuSDMC("MenuSDMC"),
	Tree("tree"), SNW("SandNW"), SNE("SandNE"), SSW("SandSW"), SSE("SandSE"),
	SN("SandN"), SS("SandS"), SW("SandW"), SE("SandE"), ON("outern"), OW("outerw");
	
	/**
         * Simple String used for the enum.  
         */
	String textName;


	/**
         * The textName maker for the enum. 
         * @param textName Used for the pre defined constant 
         */
	SqType(String textName){
		this.textName = textName;
		
	}

}
