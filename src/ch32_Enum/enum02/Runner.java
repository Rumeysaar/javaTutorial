package ch32_Enum.enum02;

public class Runner {

    /*
task
step 1 user pojo class create ed
step 2 Role adinda enum class create edin
step 3 Status adinda enum class create edin
step 4 runner class da user objeleri olsturun
step 5 user in rolun e gore silme islemi yaptirin
 */
    public static void main(String[] args) {

        User user1 = new User();
        user1.name = "Fatih";
        user1.role = Role.ADMIN;
        user1.statu = Status.ACTIVE;

        User user2 = new User();
        user2.name = "Derya";
        user2.role = Role.MEMBER;
        user2.statu = Status.LOGIN;

        System.out.println("user1 = " + user1);
        System.out.println("user2 = " + user2);

        if (user1.role == Role.ADMIN){
            System.out.println("silme islemi yapabilirsiniz");
        }else
            System.out.println("silme islemi yapamazsiniz");


    }
}
