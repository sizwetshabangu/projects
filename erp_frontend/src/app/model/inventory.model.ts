import { Category } from "./category.model";
import { Type } from "./type.model";

export interface Inventory {
    id: string, 
    name: string,
    description: string,
    price: number,
    count: number,
    category: Category,
    type: Type,
}
