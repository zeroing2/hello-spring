package zeroing2.hellospring.domain;

public class Member {

    private Long id; //고객이 저장하는게 아니라 시스템이 저장하는 시스템적 id
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
