import java.util.*;

// basic math functionality implements MathProcessing
// + -->  plus , * --> multiply

// sort , search , advance functionality , calc average 

interface MathProcessing {
    public void mathFunction(String operation, Integer[] data);
}

class BasicMathProcessing implements MathProcessing {

    @Override
    public void mathFunction(String operation, Integer[] data) {
        if (operation == "+") {

            int avg = 0;
            for (Integer i : data) {
                avg += i;
            }
            avg /= data.length;
            System.out.println(avg);
        }
        if (operation == "*") {

            int product = 1;
            for (Integer i : data) {
                product *= i;
            }
            System.out.println(product);
        }
    }
}

class AdvanceMathProcessing {

    public void calculateAvg(List<Integer> ls) {
        int avg = 0;
        for (Integer i : ls) {
            avg += i;
        }
        avg /= ls.size();
        System.out.println(avg);
    }

    public void sortData(List<Integer> ls) {
        Collections.sort(ls);
        for (Integer i : ls) {
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public void searchData(List<Integer> ls, int key) {
        for (Integer integer : ls) {
            if (integer == key) {
                System.out.println(key + " is Found !");
            }
        }
        System.out.println(key + " is not Found !");
    }

    public void replace(List<Integer> ls, int key, int replacement) {
        for (Integer integer : ls) {
            if (integer == key) {
                integer = replacement;
            }
        }
        for (Integer integer : ls) {
            System.out.println(integer + " ");
        }

    }

}

class MathAdpater implements MathProcessing {
    AdvanceMathProcessing mp = new AdvanceMathProcessing();

    public void mathFunction(String operation, Integer[] data) {
        if (operation.equalsIgnoreCase("average")) {
            mp.calculateAvg(Arrays.asList(data));

        } else if (operation.equalsIgnoreCase("sort")) {
            mp.sortData(Arrays.asList(data));

        } else if (operation.equalsIgnoreCase("search")) {
            mp.searchData(Arrays.asList(data), 2);

        } else if (operation.equalsIgnoreCase("replace")) {
            mp.replace(Arrays.asList(data), 2, 3);
        }
    }
}


class AdapterMathsProcessing 
{
    public static void main(String[] args) 
    {
        MathProcessing mp = new BasicMathProcessing();
        Integer[] arr = { 1, 2, 3, 4, 5 };
        mp.mathFunction("+", arr);
        mp.mathFunction("sort", arr);
        mp.mathFunction("*", arr);
        mp.mathFunction("average", arr);

    }
}