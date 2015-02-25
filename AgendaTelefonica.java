import java.util.HashMap;
/**
 * Write a description of class AgendaTelefonica here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AgendaTelefonica
{
    private HashMap<String, String> agenda;
    
    public AgendaTelefonica()
    {
        agenda = new HashMap<String, String>();
    }
    
    public void enterNumber(String name, String number)
    {
        agenda.put(name, number);
    }
    
    public String lookupNumber(String name)
    {
        return agenda.get(name);
    }
}
