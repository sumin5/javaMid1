package lang.object.equals;

import java.util.Objects;

public class UserV2 {

    private String id;

    public UserV2(String id) {
        this.id = id;
    }



    /*
    @Override
    public boolean equals(Object obj) {
        UserV2 user = (UserV2) obj; // 다운캐스팅을 해줘야 id 값을 가져올수 있음
        return id.equals(user.id); // this.id와 비교대상으로 넘어온 obj의 id와 비교

    }
     */

    @Override
    public boolean equals(Object o) { // equals 메서드를 직접 구현
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserV2 userV2 = (UserV2) o;
        return id.equals(userV2.id);
    }

}
