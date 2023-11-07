package urmomshouse;
import java.util.List;
import java.util.function.Function;

public class ListMonad<T>{
    List<T> list;
    Function<List<T>, List<T>> f;

    public ListMonad(List<T> list, Function<List<T>, List<T>> f){
        this.list = list;
        this.f = f;
    }

    public void setList(List<T> list){
        this.list = list;
    }

    public List<T> getList(){
        return this.list;
    }

    public void setFunction(Function<List<T>, List<T>> f){
        this.f = f;
    }  

    public Function<List<T>, List<T>> getFunction(){
        return this.f;
    }

    public ListMonad<T> bind(Function<List<T>, List<T>> f){
        return new ListMonad<T>(f.apply(this.list), f);
    }

    public void printList(){
        System.out.println(this.list);
    }
}
