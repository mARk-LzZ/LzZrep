package 第二次考核.task1;
//果汁或啤酒售完
public class IngredientSortOutException extends RuntimeException{

    public IngredientSortOutException(){
    }

    public IngredientSortOutException(String message){
        super(message);
    }

}
