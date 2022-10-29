public class Cat {
    int age;
    int weight;
    int height;
    public  Cat(int a, int w, int h) {
        // tao 1 class co 3 thuoc tinh
        //- age (tuổi)
        //- weight (cân nặng)
        //- height (chiều cao)
        //xong ô tạo một biến Cat và gán cân nặng 2 kg, age 5, height 20
        age = a;
        weight = w;
        height = h;
    }
        public void age(){
            System.out.println("age"+age);
        }

        public void weight() {
            System.out.println("weight"+weight);
        }

        public void height() {
            System.out.println("height"+height);
        }


        }



