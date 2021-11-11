package mirea.prac8;

import java.util.*;

public class UnfairWaitList<T> extends WaitList<T> {
    public UnfairWaitList() {  }

    public void remove(T element){
        if (element.equals(content.peek())){
            moveToBack();

            return;
        }

        Queue<T> elements = new ArrayDeque<>();

        int contentSize = content.size();

        for (int i = 0; i < contentSize; i++){
            T current = content.remove();

            if (!current.equals(element)) {
                content.add(current);
            }
        }

    }

    private void moveToBack(){
        T firstElement = content.remove();

        Queue<T> elements = new ArrayDeque<>();

        while (!content.isEmpty()) {
            elements.add(content.remove());
        }

        content.addAll(elements);
        content.add(firstElement);
    }
}
