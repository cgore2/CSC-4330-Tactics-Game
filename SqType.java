package data;

public enum SqType {
	
	Water("water", true), Sand("sand", false), D("dolphin", false), RD("redDolphin", false), MenuSDMC("menuButton", true)
	
	String textName;
	boolean moveable;
	
	SqType(String textName, boolean moveable){
		this.textName = textName;
		this.moveable = moveable;
	}
}
