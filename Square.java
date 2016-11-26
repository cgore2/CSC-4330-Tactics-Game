package dolphingame;


public abstract class Square 
{
    public int row;
    public int column;
    
    public Square(int r, int c)
    {
        row = r;
        column = c; 
    }
 
    
    public void setRow(int r)
    {
        row = r;
    }
     
    public void setColumn(int c)
    {
        column = c;
    }
    
    public void setSquare(int r, int c)
    {
        row = r;
        column = c; 
    }
    
    
    public int getRow()
    {
        return row;
    }
    
    public int getColumn()
    {
        return column;
    }
         
}
