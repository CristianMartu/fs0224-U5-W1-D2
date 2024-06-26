package cristianmartucci.U5_W1_D2.entities;


import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public abstract class Product {
    protected String name;
    protected int calories;
    protected double price;
}
