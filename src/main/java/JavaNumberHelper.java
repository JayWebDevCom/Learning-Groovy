import java.util.ArrayList;
import java.util.List;

public class JavaNumberHelper {

    public int[] findPositives(int[] numbers) {

        List<Integer> positiveList = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if ((numbers[i] % 2 == 0) && (numbers[i] > 0) ) {
                positiveList.add(numbers[i]);
            }
        }

        int[] positivesArray = new int[positiveList.size()];
        for (int i = 0; i < positivesArray.length; i++) {
            positivesArray[i] = positiveList.get(i);
        }

        return positivesArray;

    }
}
