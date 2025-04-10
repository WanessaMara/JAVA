using System.ComponentModel.DataAnnotations.Schema;

namespace Base;

public class Base
{
    [Column("ID")]
    public int Id { get; set; }

}