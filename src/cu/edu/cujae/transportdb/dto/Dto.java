package cu.edu.cujae.transportdb.dto;

import java.lang.reflect.Field;

public abstract class Dto {
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName()).append(":\n");
        for (Field f :
                getClass().getDeclaredFields()) {
            f.setAccessible(true);
            try{
                sb.append(f.getName()).append(" = ").append(f.get(this)).append("\n");
            }catch(IllegalAccessException e){
                e.printStackTrace();
            }
        }
        sb.append("\n");
        return sb.toString();
    }
}
