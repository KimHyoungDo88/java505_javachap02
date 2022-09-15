import java.util.Calendar;
import java.util.Date;

public class Switch {

    public static void main(String[] args){

    char grade= 'B';
        switch(grade)
    {
        case 'A':
            System.out.println("축하합니다");
            System.out.println("잘했습니다");
            break;
        case 'B':
            System.out.println("좋아요");

            break;
        case 'C':
            System.out.println("노력하세요");
            break;
        default:
            System.out.println("탈락");

    }

            System.out.println("\n\n");

        Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        int currDay = cal.get(Calendar.DAY_OF_WEEK);

        switch(currDay){

            case 1:
            System.out.println("오늘은 일요일 입니다");
            break;

            case 2:
            System.out.println("오늘은 월요일 입니다");
            break;

            case 3:
            System.out.println("오늘은 화요일 입니다");
            break;

            case 4:
            System.out.println("오늘은 수요일 입니다");
            break;

            case 5:
            System.out.println("오늘은 목요일 입니다");
            break;

            case 6:
            System.out.println("오늘은 금요일 입니다");
            break;

            case 7:
            System.out.println("오늘은 토요일 입니다");
            break;
            default:
                System.out.println(" 달력을 보세요");
                break;

        }


    }

}
