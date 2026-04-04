/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    public int getImportance(List<Employee> employees, int id) {
        Map<Integer,Employee> inputMap = new HashMap<>();

        for(Employee e : employees){
            inputMap.put(e.id,e);
        }
        return helper(inputMap,id);
    }

    private int helper(Map<Integer,Employee> inputMap,int id){
        int imp = inputMap.get(id).importance;

        for(int sub : inputMap.get(id).subordinates){
            imp += helper(inputMap,sub);
        }
        return imp;
    }
}