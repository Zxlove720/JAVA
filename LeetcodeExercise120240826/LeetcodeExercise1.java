package LeetcodeExercise120240826;

import java.util.*;

public class LeetcodeExercise1 {
    public static void main(String[] args) {
        // 需求：你有一个保存员工信息的数据结构，它包含了员工唯一的id，重要度和直系下属的id。
        // 给定一个员工数组employees，其中：
        // employees[i].id是第i个员工的ID。
        // employees[i].importance 是第i个员工的重要度。
        // employees[i].subordinates是第i名员工的直接下属的ID列表。
        // 给定一个整数id表示一个员工的ID，返回这个员工和他所有下属的重要度的总和。

        List<Integer> employee1List = new ArrayList<>();
        Collections.addAll(employee1List, 2,3);
        Employee employee1 = new Employee(1, 5, employee1List);
        List<Integer> employee2List = new ArrayList<>();
        Employee employee2 = new Employee(2, 3, employee2List);
        List<Integer> employee3List = new ArrayList<>();
        Employee employee3 = new Employee(3, 3, employee3List);
        List<Employee> employees = new ArrayList<>();
        Collections.addAll(employees, employee1, employee2, employee3);
        Solution solution = new Solution();
        int value = solution.getImportance(employees, 1);
        System.out.println(value);
    }
}

class Solution {
    HashMap<Integer, Employee> hashMap = new HashMap<>();
    public int getImportance(List<Employee> employees, int id) {
        for (Employee employee : employees) {
            hashMap.put(employee.id, employee);
        }
        return dfs(id);
    }

    public int dfs(int id) {
        Employee employee = hashMap.get(id);
        // 通过员工id得到员工对象
        int total = employee.importance;
        for (int subordinate : employee.subordinates) {
            total += dfs(subordinate);
        }
        return total;

    }
}