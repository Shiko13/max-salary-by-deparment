import model.Address;
import model.Department;
import model.User;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    private static final List<Department> departments = Stream.of(
                    new Department(1L, "Java"),
                    new Department(2L, "C#"),
                    new Department(3L, "JavaScript"))
            .toList();
    private static final List<User> users = Stream.of(
                    new User(1L, "Roman", 1000L, 1L,
                            new Address("Brest", "YK", 17)),
                    new User(2L, "Anna", 2500L, 1L,
                            new Address("Brest", "RS", 11)),
                    new User(3L, "Artem", 1500L, 2L,
                            new Address("Wroclaw", "Lenina", 1)),
                    new User(4L, "Alex", 1700L, 2L,
                            new Address("Minsk", "Ordzhonikidze", 29)),
                    new User(5L, "Ivan", 3000L, 3L,
                            new Address("Wroclaw", "Lenina", 18)))
            .toList();

    public static void main(String[] args) {
        Map<Long, Long> maxSalaryByDepartmentsId = findMaxSalary();
        Map<Long, String> nameDepartmentById = collectToMapFromDepartments();
        printMaxSalaryByDepartmentName(maxSalaryByDepartmentsId, nameDepartmentById);
    }

    private static Map<Long, Long> findMaxSalary() {
        return Main.users.stream()
                .collect(Collectors.toMap(User::getDepartmentId,
                        User::getSalary,
                        Math::max));
    }

    private static Map<Long, String> collectToMapFromDepartments() {
        return departments.stream()
                .collect(Collectors.toMap(Department::getId,
                        Department::getName));
    }

    private static void printMaxSalaryByDepartmentName(Map<Long, Long> maxSalaryByDepartmentsId,
                                                       Map<Long, String> nameDepartmentById) {
        Set<Long> idS = maxSalaryByDepartmentsId.keySet();
        for (Long id : idS) {
            System.out.println(nameDepartmentById.get(id) + " — " +
                    maxSalaryByDepartmentsId.get(id));
        }
    }
}
