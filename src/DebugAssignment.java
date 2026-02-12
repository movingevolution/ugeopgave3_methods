


void main() {

    int a = 7, b = 7;

    int min =  minimum(a,b);

    System.out.print("Min: " + min);

    }


int minimum(int a, int b) {

    if (a <= b) {

        return a;

    } else {

        return b;
    }

}