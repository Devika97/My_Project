import http from "../http-common"
class StudentService
{
getAll()
{
    return http.get("/students");
}
create(data) {
    return http.post("/students", data);
  }

}
export default new StudentService();