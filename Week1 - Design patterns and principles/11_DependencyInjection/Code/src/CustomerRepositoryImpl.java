public class CustomerRepositoryImpl implements CustomerRepository {
    @Override
    public String findCustomerById(int id) {
        return "Customer{id=" + id + ", name='John Doe'}";
    }
}
