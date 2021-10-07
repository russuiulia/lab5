int daysUntilDeadline;

if (student.Age> = 18)
{
    notificationService.SendMessageTo(student, meetingInvitation);
}
else
{
    notificationService.SendMessageTo(student.Parent, meetingInvitation);
}

if (student.Age >= 17 && student.Weight >= 58.0 && student.Height >= 1.55)
{
    ScheduleBloodDonatingSessionWith(student);
}