public class EntityService {
    public BaseEntity createEntity(int id, String createdDate, String updatedDate) {
        return new BaseEntity(id, createdDate, updatedDate);
    }

    public void printAuditInfo(BaseEntity entity) {
        System.out.println("ID: " + entity.getId());
        System.out.println("Created: " + entity.getCreatedDate());
        System.out.println("Updated: " + entity.getUpdatedDate());
    }

    public void updateEntity(BaseEntity entity, String date) {
    }
}
