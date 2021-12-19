/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package democlass;

import java.math.BigDecimal;

/**
 *
 * @author Shimaa Ahmed
 */
public class DividerAdapter implements DivideInterface {

    @Override
    public BigDecimal multiply(BigDecimal quotent) {
        return quotent;
    }
    
    
}
