int d; // days until deadline
// if the student is at least 18 years of age
if (student.Age> = 18)
{
    // send meeting invitation to the student
    notificationService.SendMessageTo(student, meetingInvitation);
}
else // if the student is younger than 18 years 
{
    // sends a meeting invitation to the student's legal guardian
    notificationService.SendMessageTo(student.Parent, meetingInvitation);
}
// student is eligible for blood donation
if (student.Age >= 17 && student.Weight >= 58.0 && student.Height >= 1.55)
{
    ScheduleBloodDonatingSessionWith(student);
}