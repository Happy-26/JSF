package domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * 在JSF中，UI组件通过value属性的EL表达式设置值，值来源于受管bean中的私有属性
 * 在页面加载时，通过绑定属性调用起getter方法获取值
 * <p>
 * 受管bean的特点：
 * 1、受管bean不需要实现序列化接口
 * 2、需要属性私有
 * 3、getter、setter
 * 4、设置作用域（六个作用域）
 * 5、内部定义受管bean方法，用于绑定命令标记的action属性等
 */


@ManagedBean(name = "student")
@RequestScoped // 设置作用域
public class Student {
    private Integer id;
    private String name;
    private Integer age;
    private List<Marvel> marvelList;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public List<Marvel> getMarvelList() {
        // 初始化list
        marvelList = new ArrayList();

        // 调用dao类
        marvelList.add(new Marvel(1, "毫克", "妇联", "国外"));
        marvelList.add(new Marvel(2, "小米", "妇联", "国外"));
        marvelList.add(new Marvel(3, "小刚", "妇联", "国外"));
        marvelList.add(new Marvel(4, "小红", "妇联", "国外"));
        marvelList.add(new Marvel(5, "阿猫", "妇联", "国外"));
        marvelList.add(new Marvel(6, "阿狗", "妇联", "国外"));
        return marvelList;
    }

    public void setMarvelList(List<Marvel> marvelList) {
        this.marvelList = marvelList;
    }
}
