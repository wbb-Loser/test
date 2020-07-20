package Pojo;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SysLog implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6697918230878258842L;
    private Integer id;
    private String  name;
    private String  sex;
    
}
