import { HttpStatusCode } from "@angular/common/http"

export interface Response<T> {
    body: T,
    statusCode: HttpStatusCode,
    mesage: string,
}
